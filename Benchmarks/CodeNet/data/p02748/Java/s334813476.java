import java.util.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
 
            int rei = Integer.valueOf(sc.next());
            int den = Integer.valueOf(sc.next());
            int wari = Integer.valueOf(sc.next());

            List<Integer> reiPrice = new ArrayList<>();
            for(int i = 0; i < rei; i++){
                reiPrice.add(Integer.valueOf(sc.next()));
            }
            
            List<Integer> denPrice = new ArrayList<>();
            for(int j = 0; j < den; j++){
                denPrice.add(Integer.valueOf(sc.next()));
            }

            List<List<Integer>> wariList = new ArrayList<>();
            for(int k = 0; k < wari; k++){
                List<Integer> wariConbi = new ArrayList<>();
                wariConbi.add(Integer.valueOf(sc.next()));
                wariConbi.add(Integer.valueOf(sc.next()));
                wariConbi.add(Integer.valueOf(sc.next()));
                wariList.add(wariConbi);
            }

            int minR = 0;
            for(int ii = 0; ii < reiPrice.size(); ii++){
                if(minR = 0){
                    minR = reiPrice.get(ii);
                }else{
                    if(minR > reiPrice.get(ii)) minR = reiPrice.get(ii);
                }
            }

            int minD = 0;
            for(int jj = 0; jj < denPrice.size(); jj++){
                if(minD = 0){
                    minD = denPrice.get(jj);
                }else{
                    if(minD > denPrice.get(jj)) minD = denPrice.get(jj);
                }
            }

            int min = minR + minD;

            int minIf = 0;
            for(int kk = 0; kk < wariList.size(); kk++){
                int r = reiPrice.get(wariList.get(kk).get(0));
                int d = denPrice.get(wariList.get(kk).get(1));
                int sum = r + d - wariList.get(kk).get(2);

                if(minIf = 0) minIf = sum;
                else if(minIf > sum) minIf = sum;
            }

            if(min > minIf) min = minIf;

            System.out.println(min);
 
        }catch(Exception e){
            e.printStackTrace();
        }        
    }
}