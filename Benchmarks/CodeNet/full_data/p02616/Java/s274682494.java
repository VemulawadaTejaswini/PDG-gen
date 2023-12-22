import java.util.*;
import java.io.*;


class Main {

    public static void main(String[] args) throws IOException
    {
        PrintWriter out = new PrintWriter(System.out);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st1.nextToken());
        int k = Integer.parseInt(st1.nextToken());
        st1 = new StringTokenizer(br.readLine());
        ArrayList<pair> arr = new ArrayList<>();
        int cntZ = 0 , cntp = 0 , cntn = 0;
        for(int i = 0 ; i < n ; i++)
        {
            long tmp  = Long.parseLong(st1.nextToken());
            if(tmp > 0) {
                arr.add(new pair(tmp , 1));
                cntp++;
            }
            else {
                if(tmp == 0)
                {
                    cntZ++;
                }
                else {
                    arr.add(new pair(-1*tmp , -1));
                    cntn++;
                }
            }
        }
        Collections.sort(arr);

        if((cntp + cntn < k) || (cntp == 0 && cntZ > 0))
        {
            out.println(0);
        }
        else
        {
            int takenN = 0;
            long mul = 1l;
            long mod = 1000000000+7;

            if(cntp == 0)
            {
                for(int i = 0 ; i < k ; i++)
                {
                    mul = ((mul%mod)*((-1l*arr.get(i).num)%mod))%mod;
                }
            }
            else
            {
                if(k >= arr.size())
                {
                    for(int i = 0 ; i < arr.size() ; i++)
                    {
                        mul = ((mul%mod)*((1l*arr.get(i).indicator*arr.get(i).num)%mod))%mod;
                    }
                }
                else
                {
                    for(int i = arr.size()-1 ; i >= 0 && k > 0 ; i--)
                    {
                        if(arr.get(i).indicator == -1)
                        {
                            if(((takenN % 2 == 0) && ((cntn-takenN) >= 2) && (k-1 > 0)) || takenN % 2 != 0)
                            {
                                mul = ((mul%mod)*((-1l*arr.get(i).num)%mod))%mod;
                                takenN++;
                                k--;
                            }

                        }
                        else
                        {
                            mul = ((mul%mod)*((arr.get(i).num)%mod))%mod;
                            k--;
                        }
                    }
                }
            }
        out.println(mul);
        out.println((mul + mod)%mod);

        }


        out.flush();
        out.close();

    }

    static class pair implements Comparable{
        long num;
        int indicator;

        public pair(long num , int indicator)
        {
            this.num = num;
            this.indicator = indicator;
        }

        @Override
        public int compareTo(Object o) {
            pair p = (pair) o;

            if(this.num > p.num)
            {
                return 1;
            }
            if(this.num < p.num)
            {
                return -1;
            }
            return this.indicator >= p.indicator ? 1 : -1;
        }

        public String toString(){
            return "(" + num + " " + indicator + ")";
        }
    }

}
