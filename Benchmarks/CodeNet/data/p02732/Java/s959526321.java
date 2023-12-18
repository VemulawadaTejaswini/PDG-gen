import java.util.*;

class Main{
    static int count;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for(int i = 0;i < n;i++){
            int num = sc.nextInt();
            list.add(num);
        }

        for(int i = 0;i < list.size()-1;i++){
            for(int j = i+1;j < list.size();j++){
                if(list.get(i) == list.get(j)){
                    count++;
                }
            }
        }
        for(int i = 0;i < list.size();i++){
            int num = counter(list,list.get(i));
            System.out.println(count - num);
        }
        
    }

    static int counter(List<Integer> list,int index){
        int count = 0;
        for(int i = 0;i < list.size();i++){
            if(list.get(i) == index){
                count++;
            }
        }
        count--;
        return count;
    }
}