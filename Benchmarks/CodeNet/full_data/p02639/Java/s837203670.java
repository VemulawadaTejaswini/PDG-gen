import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!

        Scanner sc=new Scanner(System.in);
        
        String z=sc.nextLine();
        String x[]=z.split(" ");
        boolean a[]=new boolean[6];
   
        
        int i=0;
     String y[]=new String[5];
        for(int j=0;j<5;j++){
        y[j]=x[j];
         
            
        } a[0]=true;
        for(int j=0;j<5;j++){
        
            if(y[j].equals("0")){
               
            }else if(y[j].equals("1")){
                a[1]=true;
            }else if(y[j].equals("2")){
                a[2]=true;
            }else if(y[j].equals("3")){
                a[3]=true;
            }else if(y[j].equals("4")){
                a[4]=true;
            }else if(y[j].equals("5")){
                a[5]=true;
            }
            
        }
        for(int j=0;j<5;j++){
            if(a[j]==false){
                System.out.println(j);
            }
            
        }
       
    }
}
