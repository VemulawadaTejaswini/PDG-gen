import java.io.*;
public class Main {
    public static void main(String[] args)throws IOException {
        int m = 0,f=0,r=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String str = br.readLine();
            String[] i=str.split(" ");
                m=Integer.parseInt(i[0]);
                f=Integer.parseInt(i[1]);
                r=Integer.parseInt(i[2]);
                if(m==(-1)&&f==(-1)&&r==(-1)){break;}
                if(m==(-1)||f==(-1)){System.out.println("F");}
                else if(m+f>=80){System.out.println("A");}
                else if(m+f>=65){System.out.println("B");}
                else if(m+f>=50){System.out.println("C");}
                else if(m+f>=30){if(r>=50){System.out.println("C");}
                                 else{System.out.println("D");}}
                else {System.out.println("F");}
        }
    }
}
/*import java.io.*;
public class Main{
  public static void main(String[] args)throws IOException{
    BufferedReader mBufferedReader=new BufferedReader(new InputStreamReader(System.in));
    int m=0;
    int f=0;
    int r=0;
    while(true){
      String str=mBufferedReader.readLine();
      String[]arr=str.split(" ");   
      m=Integer.parseInt(arr[0]);
      f=Integer.parseInt(arr[1]);    
      r=Integer.parseInt(arr[2]);
      if(m==( - 1)&&f==( - 1)&&r==( - 1)){
        break;
      }else if(m+f>=80){
        System.out.println("A");
      }else if(m+f>=65){
        System.out.println("B");
      }else if((m+f>=50)||r>=50){
        System.out.println("C");
      }else if(m+f>=30){
        System.out.println("D");    
      }else if(30>m+f){
        System.out.println("F");
      }else if(m==-1||f==-1){
        System.out.println("F");
      }
    }
  }
}*/
