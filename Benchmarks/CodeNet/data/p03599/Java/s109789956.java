import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int E = sc.nextInt();
        int F = sc.nextInt();
        float maxNode = 0;
        int maxS = 0;
        int maxW = 0;

        for(int a = 0; a<=30; a++) {
            for(int b = 0; b<=30; b++) {
                for(int c = 0; c<=100; c++) {
                    for(int d = 0; d<=100; d++) {
                        float water = a*A*100+b*B*100;
                        float suger = c*C + d*D;
                        float weight = water + suger;
                        if(weight > F) continue;
                        if(weight == 0) continue;
                        if(suger>(float)(E*water/100)) continue;
                        if(maxNode< (float)(100*suger/weight)) {
                            maxNode = (float)(100*suger/weight);
                            maxS = (int)suger;
                            maxW = (int)weight;
                        }
                    }
                }
            }
        }
        if(maxW == 0) maxW = 100*A;
        System.out.println(maxW+ " " + maxS);
    }
}