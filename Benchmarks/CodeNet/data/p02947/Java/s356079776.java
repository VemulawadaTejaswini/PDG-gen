import java.io.ByteArrayInputStream;
import java.util.*;
import java.util.concurrent.TimeUnit;

class Solver{
    public static void main(String[] args){
        Random rand = new Random();
        StringJoiner sb = new StringJoiner("\n");
        sb.add("100000");
        for(int i = 0; i < 100000; i++){
            sb.add(rand.ints(10, 'a', 'z' + 1).collect(StringBuilder::new, (s, c) -> s.append((char) c), StringBuilder::append));
        }
        String s = sb.toString();
        System.setIn(new ByteArrayInputStream(s.getBytes()));
        System.out.println(s);
        Timer timer = new Timer();
        timer.schedule(new TimerTask(){
            @Override
            public void run(){
                System.err.println("TLE");
            }
        }, TimeUnit.SECONDS.toMillis(2));
        Main.main(args);
        timer.cancel();
    }

    private final String[] S;

    Solver(Scanner in){
        int N = in.nextInt();
        S = new String[N];
        for(int i = 0; i < N; i++){
            S[i] = in.next();
        }
    }

    void solve(){
        long[] hashes = new long[S.length];
        for(int i = 0; i < S.length; i++){
            String s = S[i];
            char[] chars = s.toCharArray();
            int[] count = new int['z' - 'a' + 1];
            for(char c : chars){
                count[c - 'a']++;
            }
            long hash = 0;
            for(int value : count){
                hash |= (1L << (Long.SIZE - Long.numberOfLeadingZeros(hash))) << value;
            }
            hashes[i] = hash;
        }
        Arrays.sort(hashes);
        long current = hashes[0];
        int count = 1;
        long result = 0;
        for(int i = 1; i < hashes.length; i++){
            if(current == hashes[i]){
                count++;
            }else {
                current = hashes[i];
                result += count * (count - 1L) / 2;
                count = 1;
            }
        }
        result += count * (count - 1L) / 2;
        System.out.println(result);
    }
}

class Main{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        new Solver(in).solve();

        in.close();
    }
}