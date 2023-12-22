import java.util.Scanner;

	class Main{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            
            String s = sc.next();
            String SS = s+s;
            String str = sc.next();
            	if(SS.contains(str)){
                    System.out.println("Yes");
                }else{
                    System.out.println("No");
                }
        }
    }
