import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        String a = s.next();
        String b =s.next();
        if(a.length()+1 == b.length()){
            String res = "Yes";
            for(int i = 0;i<a.length();i++) {
                if (a.charAt(i) != b.charAt(i)) {
                    res = "No";
                }
            }
            System.out.println(res);
        }
        else System.out.println("No");
    }
}