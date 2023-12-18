import java.util.*;
         
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
 
            int eatRed = Integer.parseInt(sc.next());
            int eatGreen = Integer.parseInt(sc.next());

            int red = Integer.parseInt(sc.next());
            int green = Integer.parseInt(sc.next());
            int noColor = Integer.parseInt(sc.next());

            ArrayList<Integer> redTaste = new ArrayList<Integer>();
            ArrayList<Integer> greenTaste = new ArrayList<Integer>();
            ArrayList<Integer> noColorTaste = new ArrayList<Integer>();

            ArrayList<Integer> tasteGood = new ArrayList<Integer>();
            ArrayList<Integer> tasteGoodDec = new ArrayList<Integer>();
            
            for(int i = 0; i < red; i++){
                redTaste.add(Integer.parseInt(sc.next()));
            }
            
            for(int ii = 0; ii < eatRed; ii++){
                tasteGood.add(maxValue(redTaste));
            }

            for(int j = 0; j < green; j++){
                greenTaste.add(Integer.parseInt(sc.next()));
            }

            for(int jj = 0; jj < eatGreen; jj++){
                tasteGood.add(maxValue(greenTaste));
            }

            for(int k = 0; k < noColor; k++){
                noColorTaste.add(Integer.parseInt(sc.next()));
            }

            for(int l = 0; l < tasteGood.size(); l++){
                tasteGoodDec.add(maxValue(tasteGood));
            }

            for(int ll = 0; ll < noColorTaste.size(); ll++){
                int noColorMax = maxValue(noColorTaste);
                for(int lll = 0; lll < tasteGoodDec.size(); lll++){
                    if(noColorMax > tasteGoodDec.get(lll)){
                        tasteGoodDec.set(lll, noColorMax);
                        break;
                    }
                }
            }

            int sum = 0;
            for(int z = 0; z < tasteGoodDec.size(); z++){
                sum += tasteGoodDec.get(z);
            }

            System.out.println(sum);
        }catch(Exception e){
            e.printStackTrace();
        }        
    }

    private static Integer maxValue(ArrayList<Integer> taste){
        int max = 0;
        int maxIndex = 0;
        for(int i = 0; i < taste.size(); i++){
            if(max < taste.get(i)){
                max = taste.get(i);
                maxIndex = i;
            }
        }
        taste.set(maxIndex, 0);
        return max;
    }
}