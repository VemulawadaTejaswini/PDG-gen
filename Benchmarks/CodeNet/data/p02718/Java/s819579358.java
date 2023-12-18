import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        //種類の数
        int variety = scn.nextInt();
        //人気商品数と選べる数
        int popularItems = scn.nextInt();
        int count = 0;
        //総得票数と得票数リスト
        int totalVote = 0;
        List<Integer> items = new ArrayList<>();
        for (int i = 0; i < variety; i++) {
            int votes = scn.nextInt();
            totalVote += votes;
            items.add(votes);
        }
        for (Integer integer : items) {
            if(popularItems != 0) {
                if(integer >= (totalVote/(4*popularItems))) {
                    count++;
                }
            }
            
        }
        if(count >= popularItems) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        scn.close();
    }
}