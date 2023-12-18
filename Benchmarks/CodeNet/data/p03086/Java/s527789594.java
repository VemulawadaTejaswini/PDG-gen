import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] sa = s.split("");
        int n = s.length();
        int sum=0;
        int max=0;
        for(int i=0;i<n;i++){
            if (sa[i].equals("A")|| sa[i].equals("C")||sa[i].equals("G")||sa[i].equals("T")) {
                sum++;
            }else{
                sum=0;
            }
            if (sum>=max){
                max=sum;
            }
        }
        System.out.println(max);
    }
}
