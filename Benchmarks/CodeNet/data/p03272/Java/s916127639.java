import java.io.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = new String(in.readLine());
        String[] field = s.split(" ", 0);
        
        Integer allTrain = Integer.valueOf(field[0]);
        Integer frontTrain = Integer.valueOf(field[1]);
        
        // 制約
        if (allTrain >= 1 && allTrain <= 100 && frontTrain >= 1 && frontTrain <= allTrain) {
        	Integer backTrain = allTrain - frontTrain + 1;
        	System.out.println(backTrain);
        }
    }
}