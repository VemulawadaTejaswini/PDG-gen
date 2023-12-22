import java.util.Scanner;
class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int count=0;
 
        while(h*w != 0){
            for(int i =0;i<h*w;i++){
                if(count==h*w){
                    break;
                }
                System.out.printf("#");
                count++;
                if(count==h*w){
                    break;
                }
                if(count%w==0){
                    System.out.printf("\n");
                }
                System.out.printf(".");
                count++;
                if(count%w==0){
                    System.out.printf("\n");
                }
                
            }

            System.out.printf("\n");
            System.out.printf("\n");
            count=0;
            h = sc.nextInt();
            w = sc.nextInt();
        }
    }
}

    