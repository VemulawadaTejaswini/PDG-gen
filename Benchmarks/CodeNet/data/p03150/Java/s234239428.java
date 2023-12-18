import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String Sol = "keyence";
        ArrayList<Character> S_List = new ArrayList<>();
        ArrayList<Character> Solution = new ArrayList<>();
        for(int a=0;a<S.length();a++) S_List.add(S.charAt(a));
        for(int a=0;a<Sol.length();a++) Solution.add(Sol.charAt(a));
        int check=0;
        for(int a=0;a<Solution.size();a++) if(S_List.contains(Solution.get(a))==true) check++;
        if(check!=Solution.size()) System.out.println("NO");
        else {
            int num = 0;
            ArrayList<Integer> List = new ArrayList<>();
            for (int a = 0; a < S_List.size(); a++) {
                if (S_List.get(a) == Solution.get(num)) {
                    List.add(num);
                    num++;
                } else List.add(8);
                if (num == 7 && a < S_List.size() - 1) {
                    List.add(8);
                    break;
                } else if (num == 7) break;
            }
            if (num == 7) {
                int check_num = 0;
                for (int a = 0; a < List.size() - 1; a++) {
                    if (List.get(a) == 8 && List.get(a + 1) < 7) check_num++;
                    else if (List.get(a) < 7 && List.get(a + 1) == 8) check_num++;
                }
                if (check_num <= 2) System.out.println("YES");
                else System.out.println("NO");
            }
            else System.out.println("NO");
        }
    }
}