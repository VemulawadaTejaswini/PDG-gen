import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        long l = sc.nextInt();
        long r = sc.nextInt();
        long ans = 0;
        int a1 = 0;
        long tmp = 2018;

        if(r < 2019){
            System.out.println(l*r);
        }else if(l >= 2019){
                for(long R =l+1;R <= r;R++){
                    ans = (l*R)%2019;
                    if(tmp > ans){
                        tmp = ans;
                    }
                }
                System.out.println(tmp);
            }
            
        }
    }
