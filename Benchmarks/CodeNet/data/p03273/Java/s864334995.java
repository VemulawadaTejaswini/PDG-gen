import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
      int m = sc.nextInt();
      ArrayList<String>line=new ArrayList<String>();
      String aqqqqq=sc.nextLine();
      for(int i=0;i<n;i++){
        String a=sc.nextLine();
        line.add(a);
      }
      String check="";
      for(int i=0;i<m;i++){
        check+=".";
      }
      for(int i=0;i<line.size();i++){
      	if(line.get(i).equals(check)){
          line.remove(i);i--;
        }
        
      }
      boolean b[]=new boolean[m];
      for(int i=0;i<m;i++)b[i]=true;
      for(int i=0;i<line.size();i++){
      	for(int j=0;j<m;j++){
          b[j]=!(line.get(i).substring(j,j+1).equals("#")||!b[j]);
      	}
      }
      for(int i=0;i<line.size();i++){
      	for(int j=0;j<m;j++){
        	if(!b[j]){
      			System.out.print(line.get(i).substring(j,j+1));
        	}
      	}
      	System.out.println();
      }
        
    }
}