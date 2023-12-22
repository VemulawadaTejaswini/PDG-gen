import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        //HashMap<String, Integer> h = new HashMap<>();
        int[] bT = {0,0,0,0};

        while(sc.hasNext()){
            String[] blood = sc.next().split(",");
            switch (blood[1]){
                case "A" :
                    bT[0] += 1;
                    break;
                case "B":
                    bT[1] += 1;
                    break;
                case "O":
                    bT[2] += 1;
                    break;
                case "AB":
                    bT[3] += 1;
                    break;
            }
        }

        for(int bloodType : bT){
            System.out.println(bloodType);
        }
    }
}
