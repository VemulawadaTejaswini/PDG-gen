import java.util.Scanner;

public class Main{ 
        public static void main(String[] args){
            int i;
            String a;
            char b[];
            b = new char[2000];
                Scanner n = new Scanner(System.in);
                a = n.nextLine();
                for(i=0;i<a.length();i++){
                    b[i] = a.charAt(i);
                    if(b[i] >= 'a' && b[i]<='z'){
                        b[i] -= 32;
                    }else if(b[i] >= 'A' && b[i] <= 'Z'){
                        b[i] += 32;
                    }
                }
                for(i=0;i<a.length();i++){
                    System.out.print(b[i]);
                }
                System.out.printf("\n");
        }
    }
