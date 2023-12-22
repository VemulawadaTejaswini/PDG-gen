import java.util.*;
import java.io.*;
class Main{
  public static void main(String args[]){
    int n = readI();
    int nn = n*n,count=0;
    int a[][] = new int[n][n];
    boolean flg[][] = new boolean[n][n];
    boolean exist[][] = new boolean[n][n];
    for(int i=0;i<n;i++){
      for(int j=0;j<n;j++){
        a[i][j] = i*n+j;
        exist[i][j] = true;
        if(i==0||i==n-1||j==0||j==n-1){
          flg[i][j]=true;
        }
      }
    }
    for(int i=0;i<nn;i++){
      int k = readI()-1;
      int h=k/n,w=k%n;
      if(flg[h][w]){
        exist[h][w] = false;
        ArrayList<Integer[]>list = new ArrayList<Integer[]>();
        list.add(new Integer[]{h,w});
        while(list.size()!=0){
          int x[] = Itoi(list.get(0));
          list.remove(0);
          if(x[0]!=0){
            if(!flg[x[0]-1][x[1]]){
              flg[x[0]-1][x[1]]=true;
              if(!exist[x[0]-1][x[1]]){
                list.add(new Integer[]{x[0]-1,x[1]});
              }
            }
          }
          if(x[0]!=n-1){
            if(!flg[x[0]+1][x[1]]){
              flg[x[0]+1][x[1]]=true;
              if(!exist[x[0]+1][x[1]]){
                list.add(new Integer[]{x[0]+1,x[1]});
              }
            }
          }
          if(x[1]!=0){
            if(!flg[x[0]][x[1]-1]){
              flg[x[0]][x[1]-1]=true;
              if(!exist[x[0]][x[1]-1]){
                list.add(new Integer[]{x[0],x[1]-1});
              }
            }
          }
          if(x[1]!=n-1){
            if(!flg[x[0]][x[1]+1]){
              flg[x[0]][x[1]+1]=true;
              if(!exist[x[0]][x[1]+1]){
                list.add(new Integer[]{x[0],x[1]+1});
              }
            }
          }
        }
      }else{
        ArrayList<Integer[]>list = new ArrayList<Integer[]>();
        list.add(new Integer[]{h,w,0});
        int cc = -1;
        while(list.size()!=0){
          int x[] = Itoi(list.get(0));
          list.remove(0);
          if(flg[x[0]][x[1]]){
            if(cc==-1||cc>x[2]){
              cc = x[2];
            }
          }else{
            int xxx=1;
            if(!exist[x[0]][x[1]]){
              xxx=0;
            }
            if(cc!=-1&&xxx+x[2]>=cc){continue;}
            list.add(new Integer[]{x[0]-1,x[1],x[2]+xxx});
            list.add(new Integer[]{x[0]+1,x[1],x[2]+xxx});
            list.add(new Integer[]{x[0],x[1]-1,x[2]+xxx});
            list.add(new Integer[]{x[0],x[1]+1,x[2]+xxx});
          }
        }
        exist[h][w] = false;
        count+=cc;
      }
    }
    pl(count+"");
  }

  static final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  public static void pr(String str){
    System.out.print(str);
  }
  public static void pl(String str){
    System.out.println(str);
  }
  public static String readL(){
    try{
      return br.readLine();
    }catch(IOException e){
      e.printStackTrace();
      return "";
    }
  }
  public static String readS(){
    StringBuilder sb = new StringBuilder();
    while(true){
      try{
        int k = br.read();
        if(k==-1||(char)k==' '||(char)k=='\n'){break;}
        sb.append((char)k);
      }catch(IOException e){
        e.printStackTrace();
      }
    }
    return sb.toString();
  }
  public static int readI(){
    return stoi(readS());
  }
  public static String[] readSs(){
    return readL().split(" ");
  }
  public static int[] readIs(){
    return stoi(readSs());
  }
  public static int stoi(String s){
    return Integer.parseInt(s);
  }
  public static int[] stoi(String s[]){
    int a[]=new int[s.length];
    for(int i=0;i<s.length;i++){
      a[i]=stoi(s[i]);
    }
    return a;
  }
  public static String itos(int i){
    return String.valueOf(i);
  }
  public static String[] itos(int[] a){
    String s[]=new String[a.length];
    for(int i=0;i<a.length;i++){
      s[i]=itos(a[i]);
    }
    return s;
  }
  public static String ctos(char c){
    return String.valueOf(c);
  }
  public static String cstos(char[] c){
    return new String(c);
  }
  public static char stoc(String s){
    return s.charAt(0);
  }
  public static char[] stocs(String s){
    return s.toCharArray();
  }
  public static int[] Itoi(Integer a[]){
    int[]result=new int[a.length];
    for(int i=0;i<a.length;i++){
      result[i]=a[i];
    }
    return result;
  }
}
