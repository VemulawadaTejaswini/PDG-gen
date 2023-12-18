import java.util.*;


public class Main {
    public static void main(String[] args) {
      
        //Scanner sc = new Scanner("6\nkhabarovsk 20\nmoscow 10\nkazan 50\nkazan 35\nmoscow 60\nkhabarovsk 40\n");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        sc.nextLine();
        String tmp;
        String[] str;
        ShopHyouka[] arr_shophyouka = new ShopHyouka[count];
        ShopHyouka tmp_shophyouka = new ShopHyouka();

        for(int i = 0; i < count; i++){
            tmp = sc.nextLine();
            str = tmp.split(" ");
            arr_shophyouka[i] = new ShopHyouka();
            arr_shophyouka[i].number = i + 1;
            arr_shophyouka[i].name = str[0];
            arr_shophyouka[i].hyouka = Integer.parseInt(str[1]);

        }
        for(int i = 0; i < count; i++){
            for(int j =i; j < count; j++){
                if(arr_shophyouka[i].name.compareTo(arr_shophyouka[j].name) > 0){
                    tmp_shophyouka = arr_shophyouka[j];
                    arr_shophyouka[j] = arr_shophyouka[i];
                    arr_shophyouka[i] = tmp_shophyouka;
                }
            }
        }
        for(int i = 0; i < count - 1; i++){
            if(arr_shophyouka[i].name.compareTo(arr_shophyouka[i+1].name) == 0){
                if(arr_shophyouka[i].hyouka < arr_shophyouka[i + 1].hyouka) {
                    tmp_shophyouka = arr_shophyouka[i];
                    arr_shophyouka[i] = arr_shophyouka[i+1];
                    arr_shophyouka[i+1] = tmp_shophyouka;
                }
            }
        }

        for(int i = 0; i < count; i++){
            System.out.println(arr_shophyouka[i].number);
        }
    }
}

    class ShopHyouka{
        int number;
        String name;
        int hyouka;
        
    }