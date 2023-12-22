import java.util.Scanner;

public class Main{
	public static void main(String args[]){
      test_ans();
    }

    private static void test_mine(){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();

        int count = 0;
        if(s.charAt(1) == 'S'){
            if(s.charAt(0) == 'R' || s.charAt(2) == 'R')
                count = 1;
            else
                count = 0;
        }else{
            if(s.charAt(0) == 'R'){
                if(s.charAt(2) == 'R'){
                    count = 3;
                }else{
                    count = 2;
                }
            }else if(s.charAt(2) == 'R'){
                if(s.charAt(0) == 'R'){
                    count = 3;
                }else{
                    count = 2;
                }
            }else
                count = 1;
            }
        System.out.println(count);
    }

    private static void test_ans(){
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        
        boolean p = s.charAt(0) == 'R';
        boolean q = s.charAt(1) == 'R';
        boolean r = s.charAt(2) == 'R';

        int count = 0;
        if(p && q && r)
            count = 3;
        else if((p && q) || (q && r))
            count = 2;
        else if(p || q || r)
            count = 1;
        else
            count = 0;

        System.out.println(count);
    }
}