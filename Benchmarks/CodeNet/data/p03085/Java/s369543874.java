

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] b = sc.next().toCharArray();
        for(int i=0;i<b.length;i++){
            if(b[i] == 'A'){
                System.out.print('T');
            }else if(b[i] == 'T'){
                System.out.println('A');
            }else if(b[i] == 'C'){
                System.out.println('G');
            }else{
                System.out.println('C');
            }
        }
        sc.close();
    }
    
}