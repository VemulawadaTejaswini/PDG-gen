import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String A=s.nextLine();
        String B=s.nextLine();
        String C=s.nextLine();
        Queue<Character> qA=new LinkedList<>();
        Queue<Character> qB=new LinkedList<>();
        Queue<Character> qC=new LinkedList<>();
        for(int i=0;i<A.length();i++){
            qA.add(A.charAt(i));
        }
        for(int i=0;i<B.length();i++){
            qB.add(B.charAt(i));
        }
        for(int i=0;i<C.length();i++){
            qC.add(C.charAt(i));
        }
        char curr_char='a';
        while(!qA.isEmpty() || !qB.isEmpty() || !qC.isEmpty()){
            if(curr_char=='a'){
                if(qA.isEmpty()){
                    System.out.println("A");
                    break;
                }

                curr_char=qA.remove();
            }
            if(curr_char=='b'){
                if(qB.isEmpty()){
                    System.out.println("B");
                    break;
                }

                curr_char=qB.remove();
            }
            if(curr_char=='c'){
                if(qC.isEmpty()){
                    System.out.println("C");
                    break;
                }
                curr_char=qC.remove();
            }
        }


    }
}
