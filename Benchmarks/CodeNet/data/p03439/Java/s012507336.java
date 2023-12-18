import java.util.Scanner;

public class Main {

 
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            System.out.println("0");System.out.flush();
            String s=scanner.next();
            String last="";
            if (s.equals("Vacant")){
                return;
            } else {
                last=s;
            }
            int i=2;
            boolean find=false;
            while (!find){
                System.out.println(i);System.out.flush();
                s=scanner.next();
                if (s.equals("Vacant")){
                    find = true;
                } else if (s.equals(last)){
                    last=s; 
                } else {
                    System.out.println(i-1);System.out.flush();
                    s=scanner.next();
                    if (s.equals("Vacant"))  find=true; 
                }
                i=(i+2)%N;
            }          
        }
}