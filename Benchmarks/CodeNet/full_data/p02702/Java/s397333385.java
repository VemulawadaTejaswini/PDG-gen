import java.util.Scanner;
class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int count = 0;
        if(s.length() < 4) System.out.println(0);
            int i = 0;
        int j = i + 3;
            while(i != s.length() - 3 ) {

                if(Long.parseLong(s.substring(i,j)) % 2019 == 0) {
                    count ++;
                }
                j ++;
                if(j > s.length()) {
                    i ++;
                    j = i + 3;
                }
            }
        System.out.println(count);

        }
    }