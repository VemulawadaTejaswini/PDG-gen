import java.util.*;
class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int a =0;
        int b =0;
        
            outloop: for (int i = 0;;i++){
                for (int j =0 ;;j++){
                    if (j*j*j*j*j-i*i*i*i*i==x){
                        a = j;
                        b = i;
                        break outloop;
                    } 
                }
            }
            System.out.println(a+" "+b);
            }
        }