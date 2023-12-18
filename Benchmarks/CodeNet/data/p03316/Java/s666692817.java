public class Main {

    public static void main(String[] args) {
        int nLen = args[0].length();
        int nOrg = Integer.valueOf(args[0]);
        int n = nOrg;
        int sn = 0;
        while(n > 0) {
            sn += n % 10;
            n = n / 10;
        }

        StringBuilder sb = new StringBuilder();
        if (nOrg % sn == 0)
            sb.append("Yes");
        else
            sb.append("No");

        System.out.print(sb.toString());

    }

}