import java.io.*;
import java.util.ArrayList;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int q = Integer.parseInt(input[1]);
        String[] names = new String[n];
        ArrayList<int[]> processes = new ArrayList<int[]>();
        int[] currentProcess;
        int time = 0;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            input = br.readLine().split(" ");
            names[i] = input[0];
            processes.add(new int[] {i, Integer.parseInt(input[1])});
        }

        while (processes.size() > 0) {
            currentProcess = processes.remove(0);
            if (currentProcess[1] <= q) {
                time += currentProcess[1];
                sb.append(names[currentProcess[0]]).append(" ").append(time).append("\n");
            } else {
                time += q;
                currentProcess[1] -= q;
                processes.add(currentProcess);
            }
        }
        System.out.print(sb.toString());
    }
}