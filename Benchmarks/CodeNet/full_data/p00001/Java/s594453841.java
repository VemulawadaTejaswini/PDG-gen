f=0
s=0
t=0
i=0
10.times do
	m=ARGV[i].to_i
        if f<m
              	j=m
                m=f
                f=j
        end
	if s<m
              	j=m
                m=s
                s=j
        end
	if t<m
              	j=m
                m=t
                t=j
        end
i=i+1
end
puts "#{f}","#{s}","#{t}"