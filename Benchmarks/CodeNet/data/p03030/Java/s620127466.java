import java.util.*;

class Main{
    public static void main(String argv[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        ArrayList<String> city_and_score = new ArrayList<String>();
        sc.nextLine();
        for(int i=0;i<N;i++){
            city_and_score.add(sc.nextLine());
            city_and_score.set(i, city_and_score.get(i) + " "+ (i+1));
        }
        sc.close();
        city_and_score.sort((a,b)->a.compareTo(b));

        for(int i=0;i<N;i++){
            String[] first_tmp = city_and_score.get(i).split(" ");
            List<Integer> number = new ArrayList<Integer>();
            number.add(Integer.parseInt(first_tmp[2]));
            int count=1;
            while(true){
                if(i > N-1){
                    i--;
                    break;
                }
                String[] tmp = city_and_score.get(i).split(" ");
                int num = Integer.parseInt(tmp[2]);
                if(!first_tmp[0].equals(tmp[0])){
                    i--;
                    break;
                }
                if(tmp[1].equals("100")){
                    System.out.println(num);
                    i++;
                    continue;
                }
                number.add(num);
                count++;
                i++;
            }
            for(int j=count-1;j>0;j--){
                System.out.println(number.get(j));
            }
        }
    }
}