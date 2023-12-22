import java.util.*;
public class Main {

    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);

        boolean[] thirtyone = new boolean[31];

        for (int i=0;i<28;i++){
            thirtyone[sc.nextInt()] = true;
        }
        for (int i=1;i<31;i++){
            if(!thirtyone[i]){
                System.out.println(i);
            }
        }
    }
}