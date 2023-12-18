int[] a = sc.nextIntArray(n+1);
        int[] b = sc.nextIntArray(n);
        
        long res = 0;
        
        for(int i = 0; i < n; i++) { //勇者i
            if(a[i] - b[i] >= 0) {
                res+=b[i];
                b[i]=0;
                a[i]-=b[i];
            }else{
                res+=a[i];
                b[i]-=a[i];
                a[i]=0;
            }
            
            if(b[i] != 0) {
                if(a[i+1] - b[i] >= 0) {
                    res+=b[i];
                    a[i+1]-=b[i];
                }else{
                    res+=a[i+1];
                    a[i+1]=0;
                }
            }
        }
        
        out.println(res);
