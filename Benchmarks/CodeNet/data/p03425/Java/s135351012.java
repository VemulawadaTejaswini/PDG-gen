import java.util.*;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double N = sc.nextInt();
        double topM = 0;
        double topA = 0;
        double topR = 0;
        double topC = 0;
        double topH = 0;
        for (int i=0;i<N;i++){
            String name = sc.next();
            if (name.startsWith("M")){
                topM += 1;
            }else if (name.startsWith("A")){
                topA += 1;
            }else if (name.startsWith("R")){
                topR += 1;
            }else if (name.startsWith("C")){
                topC += 1;
            }else if (name.startsWith("H")){
                topH += 1;
            }
        }
        List<Double> names = new ArrayList<>();
        names.add(topM); names.add(topA);
        names.add(topR); names.add(topC);
        names.add(topH);
        double result = 0;
        for (int i=0;i<5;i++){
            for (int j=i+1;j<5;j++){
                for (int k=j+1;k<5;k++){
                    result += names.get(i) * names.get(j) * names.get(k);
                }
            }
        }
        System.out.printf("%.0f", result);
    }
}