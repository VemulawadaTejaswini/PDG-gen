    public static void main(String[] args) {
        int pramA = Integer.parseInt(args[0]);
        int pramB = Integer.parseInt(args[1]);
        int pramC = Integer.valueOf(args[2]);
        int pramD = Integer.valueOf(args[3]);
        
        System.out.println("A = " + pramA);
        System.out.println("B = " + pramB);
        System.out.println("C = " + pramC);
        System.out.println("D = " + pramD);
        
        int ans;
        
        if (pramB < pramC || pramD < pramA) {
            ans = 0;
        } else {
            ans =Math.abs(pramB - pramC);
        }
        
        System.out.println("Anser = " + ans);
    }