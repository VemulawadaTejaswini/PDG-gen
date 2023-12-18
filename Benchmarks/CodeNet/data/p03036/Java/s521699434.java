public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        scan.close();
        String[] data = str.split(" ");
        int r = 0;
        int d = 0;
        int x = 0;
        int ans[] = {0,0,0,0,0,0,0,0,0,0,0};
        r = Integer.parseInt(data[0]);
        d = Integer.parseInt(data[1]);
        x = Integer.parseInt(data[2]);

        ans[0] = x ;
        for (int i = 1; i < 11; i++) {
            ans[i] = r * ans[i-1] - d;
        }

        for (int i = 1; i < 11; i++) {
            System.out.println(ans[i]);
        }
    }
}