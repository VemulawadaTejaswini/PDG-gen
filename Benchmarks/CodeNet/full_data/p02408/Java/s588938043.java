
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class Cards {

    String picture;
    int number;

    public Cards(String picture, int number) {
        this.picture = picture;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getPicture() {
        return picture;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public void print() {
        System.out.println(picture + " " + number);
    }
}

/**
 *
 * @author k16069kk
 */
public class Main {

    private static void sorting(List<Integer> num) {

        
            Collections.sort(num);
            System.out.println(num);
        
    }

    private static void Search(List<Integer> list, String pic, List<Cards> blank) {
        int i = 0;
        int j = 1;
        list.add(0);
        while(list.size() > i) {
            while (true) {
                if (list.get(i) != j && list.get(i) != 0) {
                    Cards card = new Cards(pic, j);
                    blank.add(card);
                    j++;
                } else if(list.get(i) == j){
                    i++;
                    j++;
                    break;
                } else 
                if(list.get(i) == 0 && list.get(i-1) != 13){
                    Cards card = new Cards(pic, 13);
                    blank.add(card);
                    i++;
                    break;
                } else {
                    i++;
                    break;
                }
            }
        }
    }

    private static void pickup(int index, List<Integer> num_list, List<String> pic_list, List<Cards> blank) {
        List<Integer> S_num = new ArrayList<>();
        List<Integer> H_num = new ArrayList<>();
        List<Integer> C_num = new ArrayList<>();
        List<Integer> D_num = new ArrayList<>();

        for (int n = 0; n <= index - 1; n++) {
            if (pic_list.get(n).equals("S")) {
                S_num.add(num_list.get(n));
            }
            if (pic_list.get(n).equals("H")) {
                H_num.add(num_list.get(n));
            }
            if (pic_list.get(n).equals("C")) {
                C_num.add(num_list.get(n));
            }
            if (pic_list.get(n).equals("D")) {
                D_num.add(num_list.get(n));
            }
        }
        
        sorting(S_num);
        sorting(H_num);
        sorting(C_num);
        sorting(D_num);

        Search(S_num, "S", blank);
        Search(H_num, "H", blank);
        Search(C_num, "C", blank);
        Search(D_num, "D", blank);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        int index = 0;
        int count = 0;

        List<String> pic_list = new ArrayList<>();
        List<Integer> num_list = new ArrayList<>();
        List<Cards> card = new ArrayList<>();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = br.readLine()) != null) {
            if (index == 0) {
                index = Integer.parseInt(line);
            } else {
                java.util.StringTokenizer st = new StringTokenizer(line, " ");
                while (st.hasMoreTokens()) {
                    pic_list.add(st.nextToken());
                    num_list.add(Integer.parseInt(st.nextToken()));
                    count++;
                }
                if (index == count) {
                    break;
                }

            }
        }
        System.out.println("");
        pickup(index, num_list, pic_list, card);
        for (Cards card1 : card) {
            card1.print();
        }

    }
}

