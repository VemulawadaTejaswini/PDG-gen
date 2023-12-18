for(int i=0;i<W;i++){
            for(int j=0;j<H;j++){
                A[i][j]=sc.next();
                counter[i][j]=0;
            }
        }
        for(int i=0;i<W;i++){
            for(int j=0;j<H;j++){
                while(i<W-1){
                    i++;
                    counter[i][j]++;
                    if(A[i][j].equals("#")){
                        break;
                    }
                }
                while(j<=H-1){
                    j++;
                    counter[i][j]++;
                    if(A[i][j].equals("#")){
                        break;
                    }
                }
            }
        }
        int max=0;
        for(int i=0;i<W;i++){
            for(int j=0;j<H-1;j++){
                if(counter[i][j]<counter[i][j+1]){
                    max=counter[i][j+1];
                }