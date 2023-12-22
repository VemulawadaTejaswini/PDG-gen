import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print(" ");
        for(int i=1;i<=n;i++){
            int x=i;
            if(x%3==0){
                System.out.print(i+" ");
            }
            else{
                if(x%10==3){
                    System.out.print(i+" ");
                    x/=10;
                        if(x%10==3){
                            System.out.print(i+" ");
                        }
                    }
                }
            }
            System.out.print("\n");
        }
    }
