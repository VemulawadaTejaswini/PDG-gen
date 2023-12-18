import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String lineNum = sc.nextLine();
        int N = Integer.parseInt(lineNum.split(" ")[0]);
        int M = Integer.parseInt(lineNum.split(" ")[1]);
        int[] Pz = new int[M];
        String[] Sz = new String[M];

        for (int m = 0; m < M; m++){
            String line = sc.nextLine();
            Pz[m] = Integer.parseInt(line.split(" ")[0]);
            Sz[m] = line.split(" ")[1];
        }

        String[] problems = new String[N];
        String[] answeredProblems = new String[N];
        for (int m = 0; m < M; m++){
            if ("AC".equals(Sz[m])){
                answeredProblems[Pz[m] - 1] = "AC";
            }
        }

        int waNum = 0;
        int acNum = 0;

        for (int m = 0; m < M; m++){
            if (!("AC".equals(answeredProblems[Pz[m] - 1]))){
                continue;
            }

//            System.out.println(problems[Pz[m] - 1] +" "+ Sz[m]);
            if ((!("AC".equals(problems[Pz[m] - 1]))) && ("WA".equals(Sz[m]))){
                waNum++;
            }
            if ((!("AC".equals(problems[Pz[m] - 1]))) && ("AC".equals(Sz[m]))) {
                acNum++;
            }
            if ("AC".equals(Sz[m])){
                problems[Pz[m] - 1] = "AC";
            }

        }

//        for (int n = 0; n < N; n++){
//            System.out.println(problems[n]);
//        }

        System.out.println(acNum+" "+waNum);

    }
}

