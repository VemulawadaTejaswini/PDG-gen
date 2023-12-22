import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String w = scanner.nextLine();
        String t = scanner.nextLine();
        
        int cnt = 0;
        while(!t.equals("END_OF_TEXT")){
            String[] tArr = t.split(" ");
            for(String t_tmp : tArr){
                if(t_tmp.toLowerCase().equals(w)){
                    cnt++;
                }
            }
            t = scanner.nextLine();
        }
        System.out.println(cnt);
    }
}

