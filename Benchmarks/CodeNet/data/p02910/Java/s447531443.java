import java.util.Scanner;
import java.util.* ;

class Syllabus
{
    public static void main(String[] arg)
    {
        Scanner scan = new Scanner(System.in);
        String S = scan.next();
        char[] a= S.toCharArray();
        boolean flag = true;
        for (int i = 0; i < S.length(); i++) {

            if(i%2 == 0 && (a[i] == 'R' || a[i] == 'U' || a[i] == 'D')) {
                continue;
            }
            else if(i%2 == 1 && (a[i] == 'L' || a[i] == 'U' || a[i] == 'D')){
                continue;
            }

            else {

                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

    }
}
