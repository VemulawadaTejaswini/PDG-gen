import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        int n = Integer.parseInt(scan.nextLine());
        double maxProfit = -100000000;
        double maxR = Integer.parseInt(scan.nextLine());
        double minR = maxR;
        double newR;
        double tmp;

        for (int i=1; i<n; i++){
            newR = Integer.parseInt(scan.nextLine());
            //System.out.printf("%d??????????¨???????, newR:%f, minR:%f, maxR:%f, maxProfit:%f\n", i, newR, minR, maxR, maxProfit);
            if (newR > minR && newR > maxR){
                //System.out.println("aiueo");
                maxProfit = newR - minR;
                maxR = newR;
            }else if (newR <= minR){
                tmp = newR - minR;
                if (tmp > maxProfit)
                    maxProfit = tmp;
                minR = newR;
                maxR = newR;
            }
            //System.out.printf("%d??????????¨???????, newR:%f, minR:%f, maxR:%f, maxProfit:%f\n\n", i, newR, minR, maxR, maxProfit);
        }
        System.out.println((int) maxProfit);
    }
}