import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int setNum = Integer.parseInt(sc.nextLine());
        List<String> inputs = new ArrayList<>();
        while(0 < setNum--) {
            inputs.add(sc.nextLine());
        }
        inputs.forEach(Main::output);
    }

    public static void output(String a) {
        List<Double> set = Arrays.stream(a.split(" ")).map(Double::valueOf).collect(Collectors.toList());
        double[] a1 = {set.get(0), set.get(1)};
        double[] b1 = {set.get(2), set.get(3)};

        double[] a2 = {set.get(4), set.get(5)};
        double[] b2 = {set.get(6), set.get(7)};

        double radian1 = Math.atan2(b1[1]-a1[1], b1[0]-a1[0]);
        double radian2 = Math.atan2(b2[1]-a2[1], b2[0]-a2[0]);

        double degree1 = radian1 * 180d / Math.PI;
        double degree2 = radian2 * 180d / Math.PI;

        if(degree1 == degree2 || Math.abs(degree1) == Math.abs(degree2-180) || Math.abs(degree1) == Math.abs(degree2+180))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}