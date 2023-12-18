public class Main {
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] str = bf.readLine().split(" ");
        int N = Integer.parseInt(str[0]), K = Integer.parseInt(str[1]), max = 0;
        String[] S = bf.readLine().split("");
        ArrayList<Integer> data = new ArrayList<>();
        int value = Integer.parseInt(S[0]);
        if (value == 0) {
            data.add(0);
        }
        for (int i = 0; i < N; value = 1 - value) {
            int count = 0;
            while (i < N && Integer.parseInt(S[i]) == value) {
                count++;
                i++;
            }
            data.add(count);
        }
        if (value == 1) {
            data.add(0);
        }
        int size = data.size(), sum = 0;
        for (int i = 0; i < 2 * K + 1 && i < size; i++) {
            sum += data.get(i);
        }
        max = sum;
        for (int i = 3; i + 2 * K - 1 < size; i += 2) {
            sum += -data.get(i - 3) - data.get(i - 2) + data.get(i + 2 * (K - 1)) + data.get(i + 2 * K - 1);
            if (max < sum) {
                max = sum;
            }
        }
        System.out.println(max);
    }
}