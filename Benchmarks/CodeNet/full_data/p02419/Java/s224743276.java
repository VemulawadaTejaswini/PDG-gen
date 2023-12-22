import java.util.Scanner;

public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String w, t;
        w = sc.next().toLowerCase();
        do{
        	t = sc.next().toLowerCase();
        	if(t.contains(w)) count++;
        }while(!t.contains("END_OF_TEXT")) ;
        System.out.println(count);
        sc.close();
    }
}
