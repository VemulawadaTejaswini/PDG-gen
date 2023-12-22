import java.util.Scanner;

class Main {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        input.nextInt();
        String[][] stack = new String[128][1024];
        int[] cnt = new int[1024];
        for (String s = input.next(); !s.equals("quit"); s = input.next()){
            int n = input.nextInt();

            if (s.equals("push")){
                stack[n][cnt[n]++] = input.next();
            }
            else if (s.equals("move")){
                int to = input.nextInt();
                stack[to][cnt[to]++] = stack[n][--cnt[n]];
            }
            else {
                System.out.println(stack[n][--cnt[n]]);
            }
        }
    }
}