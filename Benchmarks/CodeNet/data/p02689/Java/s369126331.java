public class Main {
    public static void main(final String[] args){
        final Scanner s = new Scanner(System.in);
        final int N = Integer.parseInt(s.next());
        final int M = Integer.parseInt(s.next());
        HashSet<Integer> peak = new HashSet<Integer>();
        HashMap<Integer,Integer> nameAndHigh = new HashMap<Integer,Integer>();
        HashSet<Integer> outList = new HashSet<Integer>();
        
        for(int i=1; i <= N ;i++){
           //peak.add(Integer.parseInt(s.next()));
           nameAndHigh.put(i,Integer.parseInt(s.next()));
        }
        
        for(int i=0; i<M ;i++){
            int peakNameOne = Integer.parseInt(s.next());
            int peakNameTwo = Integer.parseInt(s.next());
            int peakOne = nameAndHigh.get(peakNameOne);
            int peakTwo = nameAndHigh.get(peakNameTwo);
            int losePeak;
            if(peakOne<peakTwo){
                losePeak= peakNameOne;
            }else{
                losePeak = peakNameTwo;
            }

            //int hoge = Math.min(Integer.parseInt(s.next()),Integer.parseInt(s.next()));
            if(!outList.contains(losePeak)){
                outList.add(losePeak);
            }
         }

         System.out.println(N-outList.size());;
   

    }
}
