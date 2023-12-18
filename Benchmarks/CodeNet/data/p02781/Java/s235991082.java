import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int count = 0;
        for (int i=1;i<=n;i++){
            String temp = Integer.toString(i).replace("0","");
            if (temp.length() == k)
                count++;
        }
        System.out.println(count);

    }
}