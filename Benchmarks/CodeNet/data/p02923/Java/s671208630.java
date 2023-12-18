import java.util.*;

public class Main{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        List<Integer> H = new ArrayList<>();

        for(int i=0;i<N; i++){
            H.add(scanner.nextInt());
        }
        List<Integer> step = new ArrayList<>();
        int currentH = H.get(N-1);
        int currentStep = 0;
        for(int i=N-2; i>=0; i--){
            int nextH = H.get(i);
            if(nextH >= currentH){
                currentStep++;
            }else{
                step.add(currentStep);
                currentStep = 0;
            }
            currentH = nextH;
        }
        int answer = Collections.max(step);
        System.out.println(answer);
    }
}