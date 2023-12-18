import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine().trim();
        StringBuilder sb = new StringBuilder(s);
        boolean reversed  = false;
        int q = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < q; i++) {
            String req = scanner.nextLine().trim();
            if(req.charAt(0)=='1'){
                reversed = !reversed;
            }else{
                String[] split = req.split(" +");
                int f = Integer.parseInt(split[1]);
                char c = split[2].charAt(0);
                if((f==1) ^ reversed){
                    sb.insert(0, c);
                }else{
                    sb.append(c);
                }
            }
        }
        if(reversed){
            sb.reverse();
        }
        System.out.println(sb.toString());
    }
}