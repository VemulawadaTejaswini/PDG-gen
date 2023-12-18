import java.util.*;

class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int add = 0;
        for(int i=1;i<=2;i++){

            if(a>b){
                add +=a;
                a -=1; 
            }else{
                add +=b;
                b -=1 ;
            }
        }
        System.out.println(add);
    }
}