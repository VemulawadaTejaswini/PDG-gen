import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int i,j,k,x,y,z;
        for(i=0;;i++){
            x=sc.nextInt();
            y=sc.nextInt();
            z=sc.nextInt();
            if((x==-1)&&(y==-1)&&(z==-1)){
                break;
            }else if((x==-1)||(y==-1)){
                System.out.println("F");
            }else if(x+y>=80){
                System.out.println("A");
            }else if(x+y>=65){
                System.out.println("B");
            }else if(x+y>=50){
                System.out.println("C");
            }else if(x+y>=30){
                if(z>=50){
                    System.out.println("C");
                }else{
                    System.out.println("D");
                }
            }else{
                System.out.println("F");
            }
        }
    }
}       
