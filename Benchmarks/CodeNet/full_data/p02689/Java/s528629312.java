if __name__ == '__main__':
    
    ## input
    N, M = map(int,input().split())
    HEIGHT_LIST = list(map(int,input().split())) 
    ROAD_LIST = []
    for j in range(M): 
        ROAD_LIST.append(
            set(map(int,input().split()))
        )
    
    ## business logic
    COUNT = 0
    
    for i in list(range(1, N+1)):
        unioned_i = set([])
        for k in ROAD_LIST:
            if i in k:
                unioned_i = unioned_i | k
        if len(unioned_i) == 0:
            COUNT = COUNT + 1
            continue
        HIGHT_i = HEIGHT_LIST[i-1]
        if HIGHT_i >= max(
            [ HEIGHT_LIST[l-1] for l in list(unioned_i) ]
        ):
            COUNT = COUNT + 1
    
    ## output
    print(COUNT)