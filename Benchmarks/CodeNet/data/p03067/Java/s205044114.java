import java.util.*;

class Main {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int k = sc.nextInt();
        String[] strArray = s.split("");
        String strK = strArray[k-1];
        
        for( int i=0 ; i<n ; i++ ) {
            if( !(strArray[i].equals(strK)) ) strArray[i] = "*";
        }

        System.out.println(String.join("", strArray));
    }
}