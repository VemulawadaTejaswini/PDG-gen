import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Scanner ss=new Scanner(System.in);
        int X=sc.nextInt();
        int Y=sc.nextInt();
        if(X==Y){
            System.out.println(-1);
        }else{for(int i=2;i<1000000;i++){
            for(int j=2;j<1000000;j++){
                if(X*i!=Y*j){
                    System.out.println(X*i);
                    break;
                }
            }
            
            }
        }
    }
    }

