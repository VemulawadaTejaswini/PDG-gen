import java.io.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s = new String(in.readLine());
        String[] field = s.split(" ", 0);
        
        Integer allTrain = new Integer(field[0]);
        Integer frontTrain = new Integer(field[1]);
        
        // 制約
        if (allTrain >= 1 && allTrain <= 100 && frontTrain >= 1 && frontTrain <= allTrain) {
        	String backTrain = allTrain - frontTrain + 1;
        	System.out.println(backTrain);
        }
    }
}