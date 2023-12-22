import java.util.*;
    class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            if(n<='Z'&&n>='A'){
                System.out.println(1);
            } else if(n<='z'&&n>='a'){
                System.out.println(2);
            } else {
                System.out.println(0);
            }
        }
    } 
